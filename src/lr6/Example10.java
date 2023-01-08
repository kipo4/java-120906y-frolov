package lr6;

public class Example10 {
    public static void main(String[] args) {
        Example myex1 = new Example();
        Example myex2 = new Example();
        myex1.calcMaxMin(1,0,-9,5,25,-101);
        myex1.viewMaxMin();
        Example.calcMaxMin(3,0,500,-2,33,-5,6,17);
        Example.viewMaxMin();
        myex2.calcMaxMin(3,0,50,-2,33,-5,6,17);
        myex2.viewMaxMin();
    }
    protected static class Example{
        private static int[] MaxMin;
        //методу аргументом передается произвольное количество целочисленных аргументов
        private static int[] calcMaxMin(int ... array){
            int max = array[0];
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            MaxMin= new int[]{max, min};
            //Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
            return MaxMin;
        }
        private static void viewMaxMin() {
            System.out.println("\nMaxiMin[max] = " + MaxMin[0]);
            System.out.println("MaxiMin[min] = " + MaxMin[1]);
        }
    }
}