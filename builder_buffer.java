public class builder_buffer {
    public static void main(String[] args) {
        //stringbuilder
        long startTime, endTime;
        startTime = System.nanoTime();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<100;i++){
            sb.append("a-");
        }
        endTime=System.nanoTime();
        System.out.println("Stringbuilder time " + (endTime-startTime));

        //stringbuffer
        startTime=System.nanoTime();
        StringBuffer sbf=new StringBuffer();
        for(int i=0;i<100;i++){
            sbf.append("a-");
        }
        endTime=System.nanoTime();
        System.out.println("Stringbuffer time "+(endTime-startTime));

    }
}
