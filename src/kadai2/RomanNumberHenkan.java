package kadai2;

public class RomanNumberHenkan {

	//1～20の数をローマ数字に変換するメソッド
	public String romanNumberHenkan(int input) {

		if(notBetweenOneToTwenty(input))
			return "変換できません";

		int futaketameNum = input/10;//2桁目の数
		int hitoketameNum = input%10;//1桁目の数

		return romanNumKurikaeshi(futaketameNum,'X') + hitoketameToRomanNum(hitoketameNum);
	}

	//入力が0以下もしくは21以上かどうか判断するメソッド
	private boolean notBetweenOneToTwenty(int input) {
		if(input<=0 || 21<=input)
			return true;
		else
			return false;
	}

	//1桁目の数を入力としローマ数字に変換するメソッド
	private String hitoketameToRomanNum(int inputHitoketameNum) {

		int SyouDevidedByFive = inputHitoketameNum / 5; //入力を5で割った商
		int amariDevidedByFive = inputHitoketameNum % 5;//入力を5で割った余り

		//入力が9であればIXを返す
		if(inputHitoketameNum == 9)
			return "IX";
		//入力が4であればIVを返す
		else if(inputHitoketameNum == 4)
			return "IV";
		//入力が5であればVを返す
		else if(inputHitoketameNum == 5)
			return "V";
		//入力が6～8であればをローマ数字に変換して返す
		else if(sixToEightCheck(inputHitoketameNum)){
			return "V"+ romanNumKurikaeshi(amariDevidedByFive,'I');
		}
		//入力が上記以外(1～3)であればをローマ数字に変換して返す
		else
			return romanNumKurikaeshi(amariDevidedByFive,'I');

	}

	//入力が6～8か判定するメソッド
	private boolean sixToEightCheck(int inputNum) {
		return inputNum/5 == 1;
	}

	//任意のローマ文字を繰り返し付加するメソッド
	private String romanNumKurikaeshi(int kurikaeshi, char romanMoji) {

		//出力を初期化
		String kurikaeshiOutput = "";

		//任意のローマ文字を繰り返し付加
		for (int i=0; i<kurikaeshi; i++){
			kurikaeshiOutput = kurikaeshiOutput + romanMoji;
		}
		return kurikaeshiOutput;
	}

}
