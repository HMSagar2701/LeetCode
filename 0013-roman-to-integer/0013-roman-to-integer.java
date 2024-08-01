class Solution {
    public int romanToInt(String s) {
        // Intializing an empty array
        int [] roman = new int [128];

        // storing the roman values in the array 
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        int ans=0;

        // iterating over that array using for loop
        for(int i=0;i<s.length()-1;++i){
            //checking each character with previous character and adding it to an ans element
            if(roman[s.charAt(i)]<roman[s.charAt(i+1)]){
                ans-=roman[s.charAt(i)];
            }
            else{
                ans+=roman[s.charAt(i)];
            }
        }

    return ans + roman[s.charAt(s.length()-1 )];
    }
}