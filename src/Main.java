class Main {

    public static void main(String[] args) {

        //za pomocą konstruktora domyślnego
        Telephone telephone1 = new Telephone();
        Telephone telephone2 = new Telephone();
        telephone1.phoneModel = new PhoneModel();
        telephone2.phoneModel = new PhoneModel();

        telephone1.phoneNumber = 123456789;
        telephone1.phoneModel.producerName = "Huawei";
        telephone1.phoneModel.phoneName = "Ascend II";
        telephone1.network = "T-Mobile";

        telephone2.phoneNumber = 987654321;
        telephone2.phoneModel.producerName = "Nokia";
        telephone2.phoneModel.phoneName = "3310";
        telephone2.network = "Plus";

        /*System.out.printf("Telefon 1:\n- numer: %d\n- model: %s %s\n- sieć: %s\n\n", telephone1.phoneNumber, telephone1.phoneModel.producerName, telephone1.phoneModel.phoneName, telephone1.network);
        System.out.printf("Telefon 2:\n- numer: %d\n- model: %s %s\n- sieć: %s\n\n", telephone2.phoneNumber, telephone2.phoneModel.producerName, telephone2.phoneModel.phoneName, telephone2.network);*/

        //za pomocą własnego konstruktora
        PhoneModel phoneModel3 = new PhoneModel("Samsung","Guru Music 2");
        Telephone telephone3 = new Telephone(1234323232, phoneModel3, "T-Mobile");

        PhoneModel phoneModel4 = new PhoneModel("Sony Ericsson","P908");
        Telephone telephone4 = new Telephone(1234222232, phoneModel4, "Orange");

        System.out.printf("Telefon 3:\n- numer: %d\n- model: %s %s\n- sieć: %s\n\n", telephone3.phoneNumber, telephone3.phoneModel.producerName, telephone3.phoneModel.phoneName, telephone3.network);
        System.out.printf("Telefon 4:\n- numer: %d\n- model: %s %s\n- sieć: %s\n\n", telephone4.phoneNumber, telephone4.phoneModel.producerName, telephone4.phoneModel.phoneName, telephone4.network);

    }
}