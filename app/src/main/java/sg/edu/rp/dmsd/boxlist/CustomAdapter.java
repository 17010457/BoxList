package sg.edu.rp.dmsd.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010457 on 7/25/2018.
 */
public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<boxlistItem> boxList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<boxlistItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
        ImageView ivBox = rowView.findViewById(R.id.ivBox);

        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        boxlistItem currentItem = boxList.get(position);
        if (currentItem.getImage() == R.drawable.blue_box ) {
            ivBox.setImageResource(R.drawable.blue_box);
        } else if (currentItem.getImage()== R.drawable.orange_box){
            ivBox.setImageResource(R.drawable.orange_box);
        }
        else{
            ivBox.setImageResource((R.drawable.brown_box));
        }
        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
