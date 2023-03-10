package com.mycompany.product.converter;

import org.springframework.stereotype.Component;

import com.mycompany.product.DTO.PropertyDTO;
import com.mycompany.product.entity.PropertyEntity;

@Component
public class ConverterClass {

	public PropertyEntity dtoToEntity(PropertyDTO propertyDTO) {
		PropertyEntity pe = new PropertyEntity();
		pe.setAddress(propertyDTO.getAddress());
		pe.setDescription(propertyDTO.getDescription());
		pe.setOwnerEmail(propertyDTO.getOwnerEmail());
		pe.setOwnerName(propertyDTO.getOwnerName());
		pe.setPrice(propertyDTO.getPrice());
		pe.setTitle(propertyDTO.getTitle());
		// pe.getID(); auto generate no need
		return pe;
	}

	public PropertyDTO entityToDTO(PropertyEntity entity) {
		PropertyDTO dto = new PropertyDTO();
		dto.setAddress(entity.getAddress());
		dto.setDescription(entity.getDescription());
		dto.setOwnerEmail(entity.getOwnerEmail());
		dto.setOwnerName(entity.getOwnerName());
		dto.setPrice(entity.getPrice());
		dto.setTitle(entity.getTitle());
		dto.setID(entity.getID());
		return dto;

	}
}
