class EmailValidator{
    public static boolean validEmail(String email){
        if( email == null || email.length() == 0) return false;

        if(email.contains(" ")) return false;

        int atCount = 0;
        for(char c : email.toCharArray()){
            if(c == '@') atCount++;
        }
        if(atCount != 1) return false;

        int atPos = email.indexOf("@");
        int dotPos = email.lastIndexOf(".");

        if(atPos <= 0 || atPos == email.length() -1) return false;
        if(dotPos <= atPos+1 || dotPos == email.length() - 1) return false;

        String local = email.substring(0, atPos);
        String domain = email.substring(atPos+1);

        if(local.isEmpty() || domain.isEmpty()) return false;

        if(!Character.isLetterOrDigit(local.charAt(0)) || !Character.isLetterOrDigit(local.charAt(local.length() -1 ))) return false;
        if(!Character.isLetterOrDigit(domain.charAt(0)) || !Character.isLetterOrDigit(domain.charAt(domain.length() -1 ))) return false;

        if(email.contains("..")) return false;


        return true;
    }

    public static void main(String[] args){
        String[] testEmails = {
            "tanushka.k@domain.com", 
            "abc@def",               
            "@gmail.com",           
            "abc@.com",             
            "abc@domain..com",      
            "a@b.c",                
            "a@b.c.",               
            "ab@cd@ef.com",         
            "abc@domain.com "       
        };

        for(String email : testEmails){
            System.out.println("email is " + validEmail(email));
        }

    }
}