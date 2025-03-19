package homework_34;

    public class Person {

        private String email;
        private String password;

        public Person(String email, String password) {
            setEmail(email);
            setPassword(password);
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (isEmailValid(email)) {
                this.email = email;
            }
        }

        private boolean isEmailValid(String email) {

            if (email == null) return false;

            int indexAt = email.indexOf('@');
            int lastAt = email.lastIndexOf('@');
            if (indexAt == -1 || indexAt != lastAt) return false;

            int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
            if (dotIndexAfterAt == -1) return false;

            int lastDotIndex = email.lastIndexOf('.');
            if (lastDotIndex >= email.length() -2) return false;


            for (char ch : email.toCharArray()) {

                boolean isPass = Character.isAlphabetic(ch)
                        || Character.isDigit(ch)
                        || ch == '-'
                        || ch == '_'
                        || ch == '.'
                        || ch == '@';

                if (!isPass) return false;
            }

            if (indexAt == 0) return false;

            if (!Character.isLetter(email.charAt(0))) return false;

            return true;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            if (isPasswordValid(password)) {
                this.password = password;
            }
        }




        private boolean isPasswordValid(String password) {
            if (password == null || password.length() < 8) return false;

            boolean isDigit = false;
            boolean isUpperCase = false;
            boolean isLowerCase = false;
            boolean isSpecialSymbol = false;

            boolean[] result = new boolean[4];

            String symbols = "!%$@&*()[],.-";

            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) isDigit = true;
                if (Character.isUpperCase(ch)) isUpperCase = true;
                if (Character.isLowerCase(ch)) isLowerCase = true;
                if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;

            }

            return isDigit && isUpperCase && isLowerCase && isSpecialSymbol;

        }


        @Override
        public String toString() {
            return "Person {" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }


