import 'package:flutter/material.dart';
import 'package:focasoft/models/project_item.dart';

void main() {
  runApp(App());
}

class App extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Focasoft Engine',
      theme: ThemeData(
        primarySwatch: Colors.green,
      ),
      home: HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  List<ProjectItem> projectList = List<ProjectItem>.empty();

  int currentId = 4;

  _addIncrement() {
    currentId++;
    
    projectList.add(ProjectItem(
        id: "p$currentId",
        name: "Projeto $currentId",
        description: "Jogo número $currentId"));
  }

  HomePage() {
    projectList = [];

    projectList.add(ProjectItem(
        id: "p1", name: "Carro de Fuga", description: "Vamos fugir!"));

    projectList.add(ProjectItem(
        id: "p2",
        name: "Tank e Jato",
        description: "A game about tanks and jatos!"));

    projectList.add(ProjectItem(
        id: "p3",
        name: "Foca of War",
        description: "A game about focas and wars!"));

    projectList.add(ProjectItem(
        id: "p4",
        name: "The Best Coder",
        description: "A super programmer man!"));
  }

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Focasoft Engine'),
      ),
      body: ListView.builder(
        itemCount: widget.projectList.length,
        itemBuilder: (BuildContext ctx, int index) {
          final projectItem = widget.projectList[index];

          return Text(projectItem.name);
        },
      ),
      floatingActionButton: FloatingActionButton(
          onPressed: () => setState(() => widget._addIncrement()),
          child: Icon(Icons.add),
          backgroundColor: Colors.green),
    );
  }
}
