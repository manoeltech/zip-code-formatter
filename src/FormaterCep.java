import java.util.Scanner;

public class FormaterCep {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("What your CEP?");
            String cep = scanner.nextLine();

            String cepFormatado = formatarcep(cep);

            System.out.println("CEP formatted: " + cepFormatado);

            scanner.close();
        } catch (CepInvalidException e){
            System.out.println("Accept only 8 digits");
        }
    }

    public static String formatarcep (String cep) throws CepInvalidException {
        if (cep.length() != 8)
        throw new CepInvalidException();
        return cep.substring(0, 5).concat("-").concat(cep.substring(6, 8));
    }
}
