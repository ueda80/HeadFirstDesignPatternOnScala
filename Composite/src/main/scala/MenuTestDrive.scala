object MenuTestDrive {
  def main(args: Array[String]): Unit = {
    val pancakeHouseMenu: MenuComponent = new Menu(name = "パンケーキハウスメニュー", description = "朝食")
    val dinerMenu: MenuComponent = new Menu(name = "食堂メニュー", description = "昼食")
    val cafeMenu: MenuComponent = new Menu(name = "カフェメニュー", description = "夕食")
    val dessertMenu: MenuComponent = new Menu(name="デザートメニュー", description = "もちろんデザート！")

    val allMenus: MenuComponent = new Menu(name = "すべてのメニュー", description = "すべてを統合したメニュー")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    dinerMenu.add(new MenuItem(
      name = "パスタ",
      description = "マリナラソースのかかったスパゲティとサワードーパン",
      vegetarian = true,
      price = 3.89
    ))

    dinerMenu.add(dessertMenu)

    dessertMenu.add(new MenuItem(
      name = "アップルパイ",
      description = "バニラアイスクリームをのせたフレーク状生地のアップルパイ",
      vegetarian = true,
      price = 1.59
    ))

    val waitress: Waitress = new Waitress(allMenus)

    waitress.printMenu()
  }

}
