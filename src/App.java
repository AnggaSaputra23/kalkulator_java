
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class App {

    public static void main(String[] args) {
        kalkulatorForm kf = new kalkulatorForm();
        kf.setLocationRelativeTo(null);
        kf.setVisible(true);
    }

    public static Double penjumlahan(double angka1, double angka2) {
        Double hasil = angka1 + angka2;
        return hasil;
    }

    public static Double pengurangan(double angka1, double angka2) {
        Double hasil = angka1 - angka2;
        return hasil;
    }

    public static Double perkalian(double angka1, double angka2) {
        Double hasil = angka1 * angka2;
        return hasil;
    }

    public static Double pembagian(double angka1, double angka2) {
        Double hasil = angka1 / angka2;
        return hasil;
    }

    public static Double hitung(Double angka1, Double angka2, String operator) {
        Double hasil = null;

        if (operator.equals("+")) {
//            hasil = angka1 + angka2;
            hasil = penjumlahan(angka1, angka2);
        } else if (operator.equals("-")) {
//            hasil = angka1 - angka2;
            hasil = pengurangan(angka1, angka2);
        } else if (operator.equals("*")) {
//            hasil = angka1 * angka2;
            hasil = perkalian(angka1, angka2);
        } else if (operator.equals("/")) {
//            hasil = angka1 / angka2;
            hasil = pembagian(angka1, angka2);
        }

        return hasil;
    }
}
