class Solution {
public:
    bool isPalindrome(int x) {
        int temp=x;
        long long rev=0; 
        while(temp>0){
            int digit=temp%10;
            rev=(rev*10)+digit;
            temp=temp/10;
        }
        if(x==rev){
            return true;
        }else{
            return false;
        }
        
    }
};