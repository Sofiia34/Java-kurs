package homework_24;

    public class Dog {
        private String name;
        private int jumpHeight;
        private final int maxJumpHeight;

        public Dog(String name, int initialJumpHeight) {
            this.name = name;
            this.jumpHeight = initialJumpHeight;
            this.maxJumpHeight = initialJumpHeight * 2;
        }

        public void train() {
            if (jumpHeight + 10 <= maxJumpHeight) {
                jumpHeight += 10;
                System.out.println(name + " потренувався! Тепер він стрибає на " + jumpHeight + " см.");
            } else {
                jumpHeight = maxJumpHeight;
                System.out.println(name + " досяг максимальної висоти стрибка (" + maxJumpHeight + " см) і більше не може тренуватися.");
            }
        }
        public void jumpBarrier(int barrierHeight) {
            if (jumpHeight >= barrierHeight) {
                System.out.println(name + " успішно перескочив бар'єр висотою " + barrierHeight + " см!");
            } else {
                System.out.println(name + " не зміг перескочити бар'єр " + barrierHeight + " см.");
                if (maxJumpHeight >= barrierHeight) {
                    System.out.println(name + " може натренуватися, щоб взяти цей бар'єр! Починаємо тренування...");
                    while (jumpHeight < barrierHeight) {
                        train();
                    }
                    System.out.println(name + " тепер може взяти бар'єр!");
                    jumpBarrier(barrierHeight);
                } else {
                    System.out.println(name + " ніколи не зможе перескочити цей бар'єр, навіть після тренувань.");
                }
            }
        }
    }

