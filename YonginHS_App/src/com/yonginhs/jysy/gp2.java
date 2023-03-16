package com.yonginhs.jysy;


import java.util.Calendar;
import toast.library.meal.MealLibrary;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class gp2 extends Activity {

	ProcessTask p;
	long backPressedTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gp);

		p = new ProcessTask();
		p.execute();
	}

	public void onBtnsClick(View target) {
		setData(Integer.parseInt((String) target.getTag()));
	}

	public void setData(int index) {
		if(p.meal[index].equals(" ")) 
		{
			((TextView) findViewById(R.id.tvDate)).setText(p.date[index]);
			((TextView) findViewById(R.id.tvMeal)).setText("급식이 없습니다.\n(휴일,재량휴업일, 등등)");
			return;
		}

		((TextView) findViewById(R.id.tvDate)).setText(p.date[index]);
		((TextView) findViewById(R.id.tvMeal)).setText(p.meal[index]);
	}

	public class ProcessTask extends AsyncTask<String, Integer, Long> {

		public String[] meal = new String[7];
		public String[] date = new String[7];
		public String[] kcal = new String[7];

		@Override
		protected Long doInBackground(String... params) {
			String CountryCode = "goe.go.kr";//접속 할 교육청 도메인
			String schulCode = "J100000740";//학교 고유 코드
			String schulCrseScCode = "4";
			String schulKndScCode = "04";
			String schMmealScCode = "2";//중식 식사코드
			try {
				meal = MealLibrary.getMealNew(CountryCode, schulCode, schulCrseScCode, schulKndScCode, schMmealScCode);
				date = MealLibrary.getDateNew(CountryCode, schulCode, schulCrseScCode, schulKndScCode, schMmealScCode);
			}
			catch (Exception e) {
				gp2.this.runOnUiThread(new Runnable() {
						public void run() {
							Toast.makeText(getApplicationContext(), "네트워크 연결이 원활하지 않습니다.",
										   Toast.LENGTH_LONG).show();
						}
					});
				finish();
				return -1l;
			}

			for(int i = 1; i <= 5; i++)
			{
				if(meal[i].equals(" ")) continue;
				StringBuffer sb = new StringBuffer();
				int len = meal[i].length();
				int index = 0;
				boolean flag = false;
				while(index < len)
				{
					char c = meal[i].charAt(index);
					if(c == '(') flag = true;
					if(flag == false) sb.append(c);
					if(c == ')') flag = false;

					index++;
				}

				meal[i] = sb.toString();
			}
			return 0l;
		}

		protected void onPostExecute(Long result) {
			if(result == -1l) return;
			Calendar m = Calendar.getInstance();

			int year = m.get(Calendar.YEAR);
			int month= m.get(Calendar.MONTH) + 1;
			int day = m.get(Calendar.DATE);
			String nowDate = String.format("%04d", year) + "." + String.format("%02d", month) +"." + String.format("%02d", day);

			for(int i =0; i <= 6; i++)
			{
				if(date[i].indexOf(nowDate) != -1)
				{
					if(i == 0 || i == 6 || meal[i].equals(" "))
					{
						((TextView) findViewById(R.id.tvDate)).setText(date[i]);
						((TextView) findViewById(R.id.tvMeal)).setText("급식이 없습니다.\n(휴일, 재량휴업일, 등등)");
						break;
					}
					((TextView) findViewById(R.id.tvDate)).setText(date[i]);
					((TextView) findViewById(R.id.tvMeal)).setText(meal[i]);
					break;
				}
			}
			super.onPostExecute(result);
		}
	}
}
