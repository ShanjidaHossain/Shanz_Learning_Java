package queue.java;

class Sol
{
    int countRev (String s)
    {
        // your code here   
        int n=s.length();
        if(n%2==1){
            return -1;
        }
        int o=0;
        int c=0;
        int r=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='{'){
                o++;
            }else{
                if(o==0){
                    c++;
                }else{
                    o--;
                }
            }
            
        }
        r=((int)Math.ceil(o/2.0)+ (int)Math.ceil(c/2.0));
            return r;
    }
}