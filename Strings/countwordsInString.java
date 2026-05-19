class countwordsInString {
    public static void main(String[] args) {
        String str = "Java is very easy";
        String[] ess = str.split(" ");
        for (int i = 0; i < ess.length; i++) {
            System.out.println(ess);
        }
        System.out.println(ess.length);
    }
}