package InterfaceNumberTwo;

    interface Iphone {
        String color = "black";
        String size = "11inch";

        void apple();


        public class InterTwo implements Iphone {

            public static void main(String[] args) {
                System.out.println(color);
                System.out.println(size);

                InterTwo ex = new InterTwo();
                ex.apple();


            }

            @Override
            public void apple() {
                System.out.println("It's on");

            }

        }

    }



