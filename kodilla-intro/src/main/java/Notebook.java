public class Notebook {
        int weight;
        int price;
        int year;
        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
                this.year = year;
        }

        public void checkPrice() {
                if (this.price < 600) {
                        System.out.println("This notebook is very cheap");
                } else if (this.price >= 600 && this.price <= 1000) {
                        System.out.println("This price is good");
                } else if (this.price > 1000) {
                        System.out.println("This notebook is expensive");
                }
        }

        public void checkWeight() {
                if (this.weight < 700){
                        System.out.println("This notebook is very light");
                } else if (this.weight >= 700 && this.weight <= 1200) {
                        System.out.println("This notebook is not very light");
                } else if (this.weight > 1200){
                        System.out.println("This notebook is not very heavy");
                }

        }

        public void checkQuality() {
                if (this.price >= 1500 && this.year >= 2020) {
                        System.out.print("This notebook is high quality");
                } else if (this.price < 1500 && this.price >= 1000 && this.year < 2020){
                        System.out.println("This notebook is good quality");
                } else if (this.price <= 1000){
                        System.out.println("This notebook is low quality");
                }
        }
}
