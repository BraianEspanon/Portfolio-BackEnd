package com.braianespanon.Portfolio.security;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;

import java.io.FileInputStream;
import java.util.Map;


public class FirebaseAdminSDK {
/*
		// Ejecutar solo una vez para asignar rol a un usuario
        try {
            asignarRolFirebase("CAMBIAR_UID_ACA!!!", "CAMBIAR_ROL_ACA!!!");
        } catch (Exception e) {
			System.out.println(e.getMessage());
        }
		finally{
			System.out.println();
		}

    }

	private static void asignarRolFirebase(String uid, String rol) throws Exception {
		// Inicializar Firebase Admin SDK (solo si no está inicializado)
		if (FirebaseApp.getApps().isEmpty()) {
			FileInputStream serviceAccount = new FileInputStream("serviceAccountKey.json");
			FirebaseOptions options = FirebaseOptions.builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.build();
			FirebaseApp.initializeApp(options);
		}

		// Asignar el rol
		FirebaseAuth.getInstance().setCustomUserClaims(uid, Map.of("role", rol));
		System.out.println("Rol asignado correctamente a UID: " + uid);
	}
 */
}
