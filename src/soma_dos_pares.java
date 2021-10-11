public class soma_dos_pares {
    public static void main(String[] args) {
        float x, i=1, soma=0;
        while (i<=1000){
            x=i/2;
            if (x==(int)x) {
                soma = soma + i;
            }
            i++;
        }
        System.out.println((int)soma);
    }

}
