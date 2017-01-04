package com.itranswarp.bitcoin.explorer.repository;

import org.springframework.data.repository.CrudRepository;

import com.itranswarp.bitcoin.explorer.domain.BlockEntity;

public interface BlockRepository extends CrudRepository<BlockEntity, String> {

}