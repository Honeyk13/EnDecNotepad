/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

/**
 *
 * @author HRITHIK CHOUHAN
 */
public class Encrypt 
{
    public static String incryptdata(String s)
    {
        String encrypt = "";
        for(int i=0;i<s.length();i++)
        {
            encrypt = encrypt + (char)((int)s.charAt(i)+1);
        }
        return encrypt;
    }
    public static String decryptdata(String s)
    {
        String decrypt="";
        for(int i=0;i<s.length();i++)
        {
           decrypt = decrypt + (char)((int)s.charAt(i)-1);
        }
        return decrypt;
    }
}
