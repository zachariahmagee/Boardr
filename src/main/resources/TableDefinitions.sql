CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE location (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  name VARCHAR(100) NOT NULL
);

CREATE TABLE product (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  name VARCHAR(255) NOT NULL,
  description TEXT,
  price_cents INTEGER NOT NULL,
  sku VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE inventory (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  product_id UUID REFERENCES product(id) ON DELETE CASCADE,
  location_id UUID REFERENCES location(id) ON DELETE CASCADE,
  quantity INTEGER NOT NULL
);

CREATE TABLE "order" (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  status VARCHAR(50) NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT NOW(),
  updated_at TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE order_item (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  order_id UUID REFERENCES "order"(id) ON DELETE CASCADE,
  product_id UUID REFERENCES product(id),
  quantity INTEGER NOT NULL,
  price_cents INTEGER NOT NULL
);

CREATE TABLE fulfillment (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  order_id UUID REFERENCES "order"(id) ON DELETE CASCADE,
  location_id UUID REFERENCES location(id),
  status VARCHAR(50) NOT NULL
);