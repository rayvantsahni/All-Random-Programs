def index_all(search_list, element):
    indices = []
    
    for i in range(len(search_list)):
        if search_list[i] == element:
            indices.append([i])
            
        elif isinstance(search_list[i], list):
            for index in index_all(search_list[i], element):
                indices.append([i] + index)
                
    return indices

index_all([[[1,2,3], 2, [1,3]], [1,2,3]], 2)
