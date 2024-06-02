class ReverseString {

    String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
//        StringBuilder sb = new StringBuilder(inputString);
//        sb.reverse();
//        return sb.toString();
//        char letra;
//        String reverso = "";
//
//        for(int i = 0; i < inputString.length(); i++){
//            letra = inputString.charAt(i);
//            reverso = letra + reverso;
//        }
//        return reverso;
    }
}
