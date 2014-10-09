package naveen.customsearchview;

import com.example.customsearchviewandroid.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.SearchView;

public class MainActivity extends Activity{
	
	private SearchView serachView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		serachView=(SearchView)findViewById(R.id.searchView1);
		
		new SearchViewFormatter()
	       .setSearchBackGroundResource(R.drawable.viewunderline)
	        .setSearchIconResource(R.drawable.ic_launcher, true, true) //true to icon inside edittext, false to outside
	        .setSearchVoiceIconResource(R.drawable.ic_launcher)
	        .setSearchTextColorResource(R.color.text)
	        .setSearchHintColorResource(R.color.hint)
	        .setSearchCloseIconResource(R.drawable.close)
	        .setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS)
	        .format(serachView);
		serachView.setQueryHint("your name...");
		//serachView.setIconifiedByDefault(false);//Force to open the serachview.
		
		
	}
}
