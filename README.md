# HyperDrive Catalogo - DS6 Proyecto 2 Android

## 📱 Descripción del Proyecto

**HyperDrive Catalogo** es una aplicación móvil Android desarrollada en Kotlin que funciona como un catálogo digital de productos. Permite a los usuarios explorar productos organizados por categorías, con una interfaz moderna que utiliza un esquema de colores degradados en tonos morados.

## ✨ Características Principales

- **Catálogo de productos** con imágenes, nombres y precios
- **Filtrado por categorías** mediante dropdown
- **Diseño moderno** con Jetpack Compose y Material Design 3
- **Tema personalizado** con colores degradados morados
- **Carga dinámica** desde API REST
- **Interfaz elegante** con tarjetas y gradientes

## 🏗️ Arquitectura y Tecnologías

### Stack Tecnológico
- **Lenguaje**: Kotlin
- **UI Framework**: Jetpack Compose
- **Arquitectura**: MVVM (Model-View-ViewModel)
- **Networking**: Retrofit + OkHttp
- **Imágenes**: Coil para carga asíncrona
- **Corrutinas**: Kotlin Coroutines

### Estructura del Proyecto
```
app/src/main/java/es/sebastian/Ds6Proy2Android/
├── data/
│   ├── model/          # Modelos de datos
│   └── network/        # API y cliente HTTP
├── ui/theme/
│   ├── ProductsScreen.kt       # Pantalla principal
│   ├── ProductsViewModel.kt    # Lógica de negocio
│   ├── Theme.kt               # Configuración del tema
│   └── Color.kt               # Paleta de colores
└── MainActivity.kt            # Actividad principal
```

## 🌐 API Integration

La aplicación se conecta a una API REST:
- **Categorías**: `GET /api/categories.php`
- **Productos**: `GET /api/products.php?category={id}`

## 🎨 Paleta de Colores

Esquema de colores degradados en tonos morados:
- **Morado principal**: `#8B5CF6`
- **Morado profundo**: `#5B21B6`
- **Morado claro**: `#C4B5FD`
- **Fondo degradado**: Desde `#F8F7FF` hasta `#C4B5FD`

## 🚀 Configuración

### Requisitos
- Android Studio Hedgehog | 2023.1.1+
- Android SDK 24+
- Kotlin 1.9.0+

### Instalación
1. Clona el repositorio
2. Abre en Android Studio
3. Sincroniza dependencias
4. Ejecuta en emulador o dispositivo

### Dependencias Principales
```kotlin
// Compose
implementation("androidx.compose.material3:material3:1.1.0")

// Networking
implementation("com.squareup.retrofit2:retrofit:2.9.0")
implementation("com.squareup.retrofit2:converter-gson:2.9.0")

// Imágenes
implementation("io.coil-kt:coil-compose:2.1.0")
```

## 🔄 Funcionamiento

1. **Inicialización**: Carga categorías y productos al iniciar
2. **Filtrado**: Usuario selecciona categoría del dropdown
3. **Actualización**: Carga productos filtrados desde API
4. **Visualización**: Muestra productos en tarjetas elegantes

## 🛠️ Características Técnicas

- **Arquitectura MVVM** con separación de responsabilidades
- **Corrutinas** para operaciones asíncronas
- **Estado reactivo** con actualización automática de UI
- **Carga de imágenes** asíncrona y cacheada
- **Material Design 3** con componentes modernos

## 📄 Licencia

Proyecto educativo del curso DS6 (Desarrollo de Software 6).

## 👨‍💻 Autor

**Sebastian** - DS6 Proyecto 2 Android

---

*HyperDrive Catalogo - Una experiencia de compra moderna y elegante* 🚀