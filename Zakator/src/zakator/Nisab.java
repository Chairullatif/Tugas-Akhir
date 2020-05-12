/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakator;

/**
 *
 * @author windows
 */
public class Nisab {
    public String sapi (int p){
        if (p<30){
            return "Maaf anda tidak wajib membayar zakat maal. Minimal memiliki 30 sapi";
        }else if(p<40){
            return "1 ekor sapi jantan atau betina berumur 1 tahun";
        }else if(p<60){
            return "1 ekor sapi betina berumur 2 tahun";
        }else if(p<70){
            return "2 ekor sapi jantan atau betina berumur 1 tahun";
        }else if(p<80){
            return "1 ekor sapi jantan berumur 1 tahun dan 1 ekor betina berumur 2 tahun";
        }else if(p<90){
            return "2 ekor sapi betina berumur 2 tahun";
        }else if(p<100){
            return "3 ekor sapi jantan berumur 1 tahun";
        }else{
            return "2 ekor sapi jantan berumur 1 tahun dan ekor sapi betina berumur 2 tahun";
        }        
    }
    
    public String unta (int p){
        if (p<5){
            return "Maaf anda tidak wajib membayar zakat maal. Minimal memiliki 5 Unta";
        }else if (p<10){
            return "1 ekor kambing";
        }else if (p<15){
            return "2 ekor kambing";
        }else if (p<20){
            return "3 ekor kambing";
        }else if (p<25){
            return "4 ekor kambing";
        }else if (p<36){
            return "1 ekor anak unta betina (berumur 1 tahun lebih)";
        }else if (p<46){
            return "1 ekor anak unta betina (berumur 2 tahun lebih)";
        }else{
            return "1 ekor anak unta betina (berumur 3 tahun lebih)";
        }
    }
    
    public String kambing (int p){
        if (p<40){
            return "Maaf anda tidak wajib membayar zakat maal. Minimal memiliki 40 kambing";
        }else if (p<=120){
            return "1 ekor kambing";
        }else if (p<=200){
            return "2 ekor kambing";
        }else if (p<=300){
            return "3 ekor kambing";
        }else{
            return "Jika punya > 300 ekor. Zakat = 4 ekor kambing, dan bertambah 1 ekor setiap punya 100 ekor";
        }
    }
}
