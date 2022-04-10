public class main {
    public static void main(String[] args){
        try {
         inserir.inserirNumeros();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        try {
            soma.soma();
        } catch (AcimaDeCemException e) {
            e.printStackTrace();
        }
    }
}