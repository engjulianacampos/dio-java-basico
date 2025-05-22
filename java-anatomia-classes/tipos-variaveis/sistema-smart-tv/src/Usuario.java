public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv=new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status-> Tv ligada?  "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status-> Tv ligada?  "+ smartTv.ligada);

        smartTv.aumentarVolume();        

        smartTv.diminuirVolume(); 
        
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();        

        smartTv.diminuirCanal(); 

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Novo Canal: " + smartTv.canal);
    }
}
