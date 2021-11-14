package lesson4.Task1;

public class Numbers {
    private int[] numbers;
    Numbers (int[] numbers){
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    private int findMax(){
        int max = this.numbers[0];
        for (int i = 0; i < this.numbers.length; i++){
            if(max < this.numbers[i]) max = this.numbers[i];
        }
        return max;
    }

    private int findMin(){
        int min = this.numbers[0];
        for (int i = 0; i < this.numbers.length; i++){
            if(min > this.numbers[i]) min = this.numbers[i];
        }
        return min;
    }

    private int findSum(){
        int sum = 0;
        for (int i = 0; i < this.numbers.length; i++){
            sum += this.numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 5, 2, 6, 3, 3, 8, 2, 3};
        Numbers obj = new Numbers(arr);
        System.out.println(obj.findMax());
        System.out.println(obj.findMin());
        System.out.println(obj.findSum());
    }
}
