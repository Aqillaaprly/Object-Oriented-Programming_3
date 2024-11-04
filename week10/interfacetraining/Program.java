package interfacetraining;

public class Program {

    public static void main(String[] args) {
        Rector MrRector = new Rector();

        Undergraduated undergraduatedCumlaude = new Undergraduated("Joe", "3.51");
        Postgraduated postgraduatedCumlaude = new Postgraduated("Ben");

        // Giving Cum Laude Certificates
        MrRector.giveCumlaudeCertificate(undergraduatedCumlaude);
        MrRector.giveCumlaudeCertificate(postgraduatedCumlaude);

        // Giving Top Student Certificates
        MrRector.giveCertificateOfTopStudent(postgraduatedCumlaude);
        MrRector.giveCertificateOfTopStudent(postgraduatedCumlaude);
    }
}
