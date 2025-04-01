package homework_26.shapes;

    public class Rectangle extends Shape {
        private  double width;
        private  double height;

        public Rectangle(String name, double width, double height) {
            super(name);
            this.width = width;
            this.height = height;
        }

        public Rectangle(String name, String color, double width, double height) {
            super(name, color);
            this.width = width;
            this.height = height;
        }

        public void setDimensions(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double calculateArea() {
            double area = width * height;
            System.out.println("Area: " + area);
            return area;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }
    }


