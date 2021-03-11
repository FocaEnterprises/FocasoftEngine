package me.giverplay.karma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import me.giverplay.karma.project.list.ProjectAdapter
import me.giverplay.karma.project.list.ProjectModel

class MainActivity : AppCompatActivity() {

    private val listRecyclerAdapter: ArrayList<ProjectModel> = ArrayList()
    private var recyclerProjectList: RecyclerView? = null
    private var newProjectButton: FloatingActionButton? = null
    private var projectAdaper: ProjectAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerProjectList = findViewById(R.id.recycler_view_projects)
        newProjectButton = findViewById(R.id.new_project_button)

        recyclerProjectList?.layoutManager = LinearLayoutManager(this)
        recyclerProjectList?.setHasFixedSize(true)

        test("Antes de setar o adapter")

        projectAdaper = ProjectAdapter(listRecyclerAdapter)
        recyclerProjectList?.adapter = projectAdaper

        test("Depois de setar o adapter")
    }

    private fun test(testName: String) {
        listRecyclerAdapter.add(ProjectModel("etc", testName, "Testando", "Plataforma", "https://github.com/GiverPlay007.png"))
    }
}