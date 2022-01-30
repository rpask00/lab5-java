class Zad3
{
    public void main() throws Exception
    {
        try {
            this.printLength(null);
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
//            ślady stosu są takie same
            e.fillInStackTrace();
//            throw e;  //cz3
            throw new Exception(); //cz6
        }
    }

    public  void printLength(String str){
        System.out.println(str.length());
    }
}  