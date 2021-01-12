public class Notebook {
        int weight;
        int price;
        public Notebook(int weight, int price) {
                this.weight = weight;
                this.price = price;
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
}
