# Función para agregar un nuevo item al menú 
def agregar_item_menu(nombre, precio, kcal, ingredientes, menu): 
 menu.append({"nombre": nombre, "precio": precio, "kcal": kcal, "ingredientes": ingredientes}) 
 print(f"Se ha agregado {nombre} al menú.") 

# Función para eliminar un item del menú
def eliminar_item_menu(nombre, menu): 
    for item in menu:
         if item["nombre"] == nombre: menu.remove(item)
         
         print(f"Se ha eliminado {nombre} del menú.") 
    return print(f"No se encontró {nombre} en el menú.") 
# Función para buscar items en el menú que contengan un ingrediente específico 
def buscar_items_con_ingrediente(ingrediente, menu): 
   resultados = [item for item in menu if ingrediente in item["ingredientes"]]
   return resultados 

# Función para buscar items en el menú que sean aptos para un cliente con alergias 
def buscar_items_seguros(cliente, menu): 
    resultados = [item for item in menu if not any(alergia in item["ingredientes"] 
for alergia in cliente["alergias"])] 
    return resultados
 
 # Función principal del programa
menu = [] 
nombre_cliente = input("Ingrese su nombre: ") 
comida_favorita = input("Ingrese su comida favorita: ") 
alergias = input("Ingrese sus alergias (separadas por comas): ").split(',')
alergias = [alergia.strip()]
cliente = {"nombre": nombre_cliente, "comida_favorita": comida_favorita, "alergias": alergias} 
def main():  
   for alergia in alergias:
menu = [] 
nombre_cliente = input("Ingrese su nombre: ") 
comida_favorita = input("Ingrese su comida favorita: ") 
alergias = input("Ingrese sus alergias (separadas por comas): ").split(',')
alergias = [alergia.strip()]
cliente = {"nombre": nombre_cliente, "comida_favorita": comida_favorita, "alergias": alergias}
      
 

# Agregar algunos items al menú para prueba 
agregar_item_menu("Hamburguesa", 10, 500, ["carne", "pan", "queso"], menu) 
agregar_item_menu("Ensalada", 8, 200, ["lechuga", "tomate", "pepino"], menu) 
agregar_item_menu("Pizza", 12, 700, ["masa", "salsa", "queso", "pepperoni"], menu) 
# Mostrar menú actual 
print("Menú actual:") 
for item in menu: 
   print(f" - {item['nombre']} (${item['precio']}) - {item['kcal']} kcal - Ingredientes: {', '.join(item['ingredientes'])}") 

# Buscar items con un ingrediente específico 
ingrediente_buscar = input("Ingrese un ingrediente para buscar: ") 
resultados = buscar_items_con_ingrediente(ingrediente_buscar, menu)
print(f"Items con {ingrediente_buscar}:") 
for item in resultados: print(f" - {item['nombre']} (${item['precio']}) - {item['kcal']} kcal - Ingredientes: {', '.join(item['ingredientes'])}")
 
 
 # Buscar items seguros para el cliente 
resultados = buscar_items_seguros(cliente, menu)
print(f"Items seguros para {cliente['nombre']}:") 
for item in resultados: 
   print(f" - {item['nombre']} (${item['precio']}) - {item['kcal']} kcal - Ingredientes: {', '.join(item['ingredientes'])}") 
if __name__ == "__main__":main()


def main(): #... # Agregar items al carrito 
 while True: 
carrito = [] 
item_name = input("Ingrese el nombre del item para agregar al carrito (o 'alir' para finalizar): ") 
if item_name.lower() == 'alir':
   break 
for item in menu: 
    if item['nombre'] == item_name: carrito.append(item) 
    print(f"Se ha agregado {item_name} al carrito.") 
    break 
else: 
    print(f"No se encontró {item_name} en el menú.") 
    # Revisar carrito 

print(review_carrito()) #...
def revisar_menu(menu): print("Menú actual:") 
for i, item in enumerate(menu, start=1): print(f"{i}. {item['nombre']} (${item['precio']}) - {item['kcal']} kcal - Ingredientes: {', '.join(item['ingredientes'])}")
