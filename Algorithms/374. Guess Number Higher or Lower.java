/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long apiRes, li = 1, ls = n, mid = (li + ls) / 2;

        apiRes = guess((int)mid);

        while(apiRes != 0){
            if(apiRes == 1) li = mid + 1;
            else if(apiRes == -1) ls = mid - 1;
            mid = (li + ls) / 2;
            apiRes = guess((int)mid);
        }

        return (int)mid;
    }
}