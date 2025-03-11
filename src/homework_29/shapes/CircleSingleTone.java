package homework_29.shapes;

    public class CircleSingleTone extends Shape {

        private static CircleSingleTone instance;

        private double radius;

        private CircleSingleTone(double radius) {
            this.radius = radius;
        }

        public static CircleSingleTone getCircle(double radius) {
            if (radius < 0) return null;
            return new CircleSingleTone(radius);
        }


        @Override
        public double area() {
            // Pi * r * r
            return Math.PI * radius * radius;
        }

        @Override
        public double perimeter() {
            // Длина окружности
            // 2 * PI * r (PI * d)
            return 2 * Math.PI * radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Circle {" +
                    "radius=" + radius +
                    '}';
        }


    }


