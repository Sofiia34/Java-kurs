package homework_30;

    class Triathlete implements Swimmer, Runner {
        private String name;

        public Triathlete(String name) {
            this.name = name;
        }

        @Override
        public void swim() {
            System.out.println(name + " 🏊 плаває в басейні!");
        }

        @Override
        public void run() {
            System.out.println(name + " 🏃 біжить марафон!");
        }
    }

