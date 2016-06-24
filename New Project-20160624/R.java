class R implements Runnable{
    private String name;
    R(String name){
        this.name=name;
    }
    
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(name+":"+i);
        }
    }
}