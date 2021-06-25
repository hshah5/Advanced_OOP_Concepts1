import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

public class Database {
    public JsonObject data;

    public Database(JsonObject data) {
        this.data=data;
        }
    public JsonObject getRestaurant(String name) {
        JsonArray restaurants = (JsonArray) this.data.get("restaurants");
        int i = 0;
        JsonObject result = (JsonObject) restaurants.get(i);
        while (!result.get("name").equals(name) && i<restaurants.size())
            result = (JsonObject) restaurants.get(i++);
            if (i >= restaurants.size())
                result = null;
            return result;
    }

    public double getAvgReviews(String name) {
        JsonObject result = getRestaurant(name);
        JsonArray reviews = (JsonArray) result.get("reviews");
        double sum = 0;
        for (int i = 0; i < reviews.size(); i++)
            sum += Double.parseDouble(((JsonObject) reviews.get(i)).get("rating").toString());
        return sum/reviews.size();
    }
}