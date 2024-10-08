package msku.ceng.madlab.week2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Animal> animals;

    // Constructor
    public AnimalAdapter(Activity activity, List<Animal> animals) {
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.animals = animals;
    }

    @Override
    public int getCount() {
        // Return the size of the list
        return animals.size();
    }

    @Override
    public Object getItem(int i) {
        // Return the specific item at position i
        return animals.get(i);
    }

    @Override
    public long getItemId(int i) {
        // Return the item ID (usually position works for lists)
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView;

        rowView = mInflater.inflate(R.layout.listview_row,null);
        TextView textView =
                (TextView) rowView.findViewById(R.id.label);
        ImageView imageView =
                (ImageView) rowView.findViewById(R.id.pic);

        Animal animal = animals.get(i);

        textView.setText(animal.getType());
        imageView.setImageResource(animal.getPicId());

        return rowView;
    }
}
