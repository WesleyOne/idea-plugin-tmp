package com.github.wesleyone.ideaplugintmp.services

import com.intellij.openapi.project.Project
import com.github.wesleyone.ideaplugintmp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
