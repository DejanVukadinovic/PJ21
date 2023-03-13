class NizovniPodaci{
    private char[] slova;
    private int[][] tablicaMnozenja;
    public void setSlova(char[] s){
        slova = s;
    }
    public char[] getSlova(){
        return slova;
    }
    public NizovniPodaci(){
        tablicaMnozenja = new int[11][11];
        for(int i=0;i<11;i++){
            for(int j = 0;j<11;j++){
                tablicaMnozenja[i][j]=i*j;
            }
        }
    }
    public void printTM(){
         for(int i=0;i<11;i++){
            for(int j = 0;j<11;j++){
                System.out.print(String.format("%3d", tablicaMnozenja[i][j])+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        NizovniPodaci np = new NizovniPodaci();
        np.printTM();

        char[] n1 = {'d', 'a'};

        np.setSlova(n1);
        System.out.println(np.getSlova());
    }

}