class Garbage{
        public void finalize(){
        System.out.println("Object Memory is released");
        }
        public static void main(String args[]){
        Garbage t = new Garbage();
         t = null; 
         System.gc();
        } 
        }

