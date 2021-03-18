class ProjectItem {
  String description;
  String name;
  String id;

  ProjectItem.fromJson(Map<String, dynamic> json) {
    this.description = json['description'];
    this.name = json['name'];
    this.id = json['id'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    
    data['description'] = this.description;
    data['name'] = this.name;
    data['id'] = this.id;

    return data;
  }

  ProjectItem({this.id, this.name, this.description});
}
