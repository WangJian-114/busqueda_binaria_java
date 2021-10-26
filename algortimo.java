public class algortimo {

    public void busquedaBinaria(int[] listaOrdenada, int numero){
        int min = 0;
        int max = listaOrdenada.length-1;
        int med;
        int posicion = -1;
        while(min <= max && posicion == -1){
            med = (min+max)/2;
            if (numero == listaOrdenada[med]){
                posicion = med;
            }
            if(listaOrdenada[med] > numero){
                max = med-1;
            }else{
                min = med+1;
            }
        }
        if(posicion == -1){
            System.out.println("El numero no existe en la lista");
        }else{
            System.out.println("El numero esta en la posicion "+posicion+" de la lista");
        }
    }
}
