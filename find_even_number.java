import java.util.Scanner;
public class find_even_number {
    public static void main(String[] args) {
        int k;
        int sum=0,ortbolen=0;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen sayinizi giriniz: ");
        k= input.nextInt();

        for(int i=0;i<=k;i++){

            if(i%3==0 && i%4==0){
                System.out.println("Sayilar : "+i);
                sum =sum + i;
                ortbolen++;
            }

        }
        avg=sum/ortbolen;

        System.out.println("Sayilarin toplami : "+sum);
        System.out.println("Toplam kac adet sayi oldugu : "+ortbolen);
        System.out.println("Sayilarin ortalamasi : "+ avg);


    }

}
