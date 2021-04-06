<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".RealizadasFragment">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <ScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="horizontal"
                    android:paddingBottom="16dp">

                    <TextView
                        android:id="@+id/titutloVerRealizadas"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_gravity="center_vertical"
                        android:layout_weight="1"
                        android:gravity="center_vertical"
                        android:padding="4dp"
                        android:text="Realizadas"
                        android:textAppearance="@style/TextAppearance.AppCompat.Medium"
                        android:textSize="16sp" />

                    <View
                        android:id="@+id/divider22"
                        android:layout_width="5dp"
                        android:layout_height="match_parent"
                        android:background="@android:color/transparent" />

                    <ImageView
                        android:id="@+id/imageVoltarRealizadas"
                        android:layout_width="35dp"
                        android:layout_height="35dp"
                        android:background="@drawable/botaosombra"
                        android:contentDescription="Botão Voltar"
                        android:paddingLeft="5dp"
                        android:paddingRight="5dp"
                        android:src="@drawable/ic_arrow_back_orange_24dp" />

                    <View
                        android:id="@+id/divider23"
                        android:layout_width="5dp"
                        android:layout_height="match_parent"
                        android:background="@android:color/transparent" />

                </LinearLayout>

                <View
                    android:id="@+id/divider119"
                    android:layout_width="match_parent"
                    android:layout_height="2dp"
                    android:background="?android:attr/listDivider" />

                <TextView
                    android:id="@+id/verRealizadasTarefasDiarias"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical"
                    android:layout_weight="1"
                    android:textColor="@android:color/white"
                    android:background="@color/colorAccent"
                    android:gravity="center_vertical"
                    android:padding="4dp"
                    android:text="Tarefas Diárias"
                    android:textAppearance="@style/TextAppearance.AppCompat.Medium"
                    android:textSize="16sp" />

                <androidx.recyclerview.widget.RecyclerView
                    android:id="@+id/recyclerVerRealizadasTarefasDiarias"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent" />

                <TextView
                    android:id="@+id/textViewtextoVazioDiariasVerRealizadas"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:gravity="center"
                    android:padding="16dp"
                    android:text="Você não possui nenhuma tarefa diária realizada!"
                    android:visibility="gone" />


                <View
                    android:id="@+id/divider101"
                    android:layout_width="match_parent"
                    android:layout_height="10dp"
                    android:layout_weight="1"
                    android:background="?android:attr/listDivider"
                    android:backgroundTint="@color/black" />

                <TextView
                    android:id="@+id/verRealizadasTarefasEventuais"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical"
                    android:layout_weight="1"
                    android:gravity="center_vertical"
                    android:padding="4dp"
                    android:text="Tarefas Eventuais"
                    android:textColor="@android:color/white"
                    android:background="@color/colorAccent"
                    android:textAppearance="@style/TextAppearance.AppCompat.Medium"
                    android:textSize="16sp" />

                <androidx.recyclerview.widget.RecyclerView
                    android:id="@+id/recyclerVerRealizadasTarefasEventuais"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent" />

                <TextView
                    android:id="@+id/textViewtextoVazioEventuaisVerRealizadas"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:gravity="center"
                    android:padding="16dp"
                    android:text="Você não possui nenhuma tarefa eventual realizada!"
                    android:visibility="gone" />

            </LinearLayout>
        </ScrollView>

    </LinearLayout>

</FrameLayout>