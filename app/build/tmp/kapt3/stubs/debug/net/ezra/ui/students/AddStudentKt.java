package net.ezra.ui.students;

import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavHostController;
import coil.request.ImageRequest;
import com.google.firebase.Firebase;
import com.google.firebase.storage.FirebaseStorage;
import java.util.UUID;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a\u001e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u00a8\u0006\r"}, d2 = {"AddStudents", "", "navController", "Landroidx/navigation/NavHostController;", "PreviewLight", "saveToFirestore", "imageUrl", "", "studentName", "studentClass", "uploadImageToFirebaseStorage", "imageUri", "Landroid/net/Uri;", "app_debug"})
public final class AddStudentKt {
    
    @androidx.compose.runtime.Composable
    public static final void AddStudents(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    public static final void uploadImageToFirebaseStorage(@org.jetbrains.annotations.NotNull
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull
    java.lang.String studentName, @org.jetbrains.annotations.NotNull
    java.lang.String studentClass) {
    }
    
    public static final void saveToFirestore(@org.jetbrains.annotations.NotNull
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull
    java.lang.String studentName, @org.jetbrains.annotations.NotNull
    java.lang.String studentClass) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public static final void PreviewLight() {
    }
}