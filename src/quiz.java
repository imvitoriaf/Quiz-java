import java.util.*;

public class quiz {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("Yuri Gagarin");
        alternativas.add("A cadela Laika");
        alternativas.add("Neil Armstrong");
        alternativas.add("Marcos Pontes");
        alternativas.add("Buzz Lightyear");

        String questao = "Quem foi a primeira pessoa a viajar no Espaço?";

        String alternativaCorreta = "Yuri Gagarin";

        boolean respostaCerta = false;

        do{
            System.out.println(questao);
            //embaralhando a ordem das alternaivas
            Collections.shuffle((List<String>) alternativas);

            //mostrar as alternativas na tela
            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("["+ i +"]" + ((List<String>) alternativas).get(i)
                );
            }

            System.out.println("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            switch (resposta){
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    if (valorDaResposta.equals(alternativaCorreta)){
                        System.out.println("Resposta correta! O russo Yuri Gagarin foi a primeira pessoa a viajar para o espaço em 12 de abril de 1961.");
                        respostaCerta = true;
                    } else{
                        System.out.println("Resposta errada! Tente novamente. ");
                    }
                break;
                default:
                System.out.println("Opção inválida. Tente novamente! ");
                break;
            }


        } while(!respostaCerta);
    }
}