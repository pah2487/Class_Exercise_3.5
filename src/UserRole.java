import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * creates jfx choice dialog and response for different roles
 * @author Patrick H.
 * @since 2017-10-18
 * @version 1.0
 */
public class UserRole extends Application {
    public void start(Stage primaryStage) {
        List<String> roles = new ArrayList<>();
            roles.add("Guest");
            roles.add("Student");
            roles.add("Staff");
            roles.add("Faculty");
            roles.add("Administrator");
        ChoiceDialog<String> userChoice = new ChoiceDialog("Guest", roles);
        userChoice.setTitle("Role Dialog");
        userChoice.setHeaderText("Please select your role:");
        Optional<String> user = userChoice.showAndWait();

        Alert roleDisplay = new Alert(Alert.AlertType.INFORMATION);
        roleDisplay.setTitle("Role Dialogue");

        switch (user.get()){
            case "Guest":
                roleDisplay.setHeaderText("Welcome Guest!");
                break;
            case "Student":
                roleDisplay.setHeaderText("Welcome Student!");
                break;
            case "Staff":
                roleDisplay.setHeaderText("Welcome Staff Member!");
                break;
            case "Faculty":
                roleDisplay.setHeaderText("Welcome Faculty Member!");
                break;
            case "Administrator":
                roleDisplay.setHeaderText("Welcome Administrator!");
                break;
        }
        roleDisplay.showAndWait();
    }
}
