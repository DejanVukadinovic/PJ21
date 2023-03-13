class MatematickeOperacije{

    private int operand1;
    private int operand2;

    
    public MatematickeOperacije(){
        this.operand1 = 1;
        this.operand2 = 3;
    }
    
    public MatematickeOperacije(int first, int second){
        this.operand1 = first;
        this.operand2 = second;
    }
    public int proizvod(){
        return this.operand1*this.operand2;
    }
    public float kolicnik(){
        return (float) operand1/operand2;
    }
    public boolean prviJeVeci(){
        return operand1>operand2;
    }
    public int sumaPrvih20CijelihBrojeva(){
        int sum = 0;
        for(int i=0;i<=20;i++){
            sum+=i;
        }
        return sum;
    }
    public int razlikaBrojevaDjeljivihSa3(){
        int raz=100;
        for(int i=100;i>0;i--){
            if(i%3==0)raz-=i;
        }
        return raz;
    }

    public static void main(String args[]){
        MatematickeOperacije mop = new MatematickeOperacije();
        System.out.println(mop.proizvod());
        System.out.println(mop.kolicnik());
        System.out.println(mop.prviJeVeci());
        System.out.println(mop.sumaPrvih20CijelihBrojeva());
        System.out.println(mop.razlikaBrojevaDjeljivihSa3());

        MatematickeOperacije mops = new MatematickeOperacije(31, 4);
        System.out.println(mops.proizvod());
        System.out.println(mops.kolicnik());
        System.out.println(mops.prviJeVeci());
        System.out.println(mops.sumaPrvih20CijelihBrojeva());
        System.out.println(mops.razlikaBrojevaDjeljivihSa3());

    }
}